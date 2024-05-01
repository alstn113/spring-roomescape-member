package roomescape.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import roomescape.domain.ReservationTime;
import roomescape.dto.ReservationTimeRequest;
import roomescape.dto.ReservationTimeResponse;
import roomescape.repository.ReservationRepository;
import roomescape.repository.ReservationTimeRepository;

@Service
@Transactional(readOnly = true)
public class ReservationTimeService {

    private final ReservationRepository reservationRepository;
    private final ReservationTimeRepository reservationTimeRepository;

    public ReservationTimeService(ReservationRepository reservationRepository,
                                  ReservationTimeRepository reservationTimeRepository) {
        this.reservationRepository = reservationRepository;
        this.reservationTimeRepository = reservationTimeRepository;
    }

    public List<ReservationTimeResponse> getAllReservationTimes() {
        List<ReservationTime> reservationTimes = reservationTimeRepository.findAll();

        return reservationTimes.stream()
                .map(ReservationTimeResponse::from)
                .toList();
    }

    @Transactional
    public ReservationTimeResponse addReservationTime(ReservationTimeRequest reservationTimeRequest) {
        ReservationTime reservationTime = reservationTimeRequest.toReservationTime();

        if (reservationTimeRepository.existsByStartAt(reservationTime.getStartAt())) {
            throw new IllegalArgumentException("해당 시간은 이미 존재합니다.");
        }

        ReservationTime savedReservationTime = reservationTimeRepository.save(reservationTime);

        return ReservationTimeResponse.from(savedReservationTime);
    }

    @Transactional
    public void deleteReservationTimeById(Long id) {
        if (reservationRepository.existsByTimeId(id)) {
            throw new IllegalArgumentException("해당 시간을 사용하는 예약이 존재합니다.");
        }

        reservationTimeRepository.deleteById(id);
    }
}
