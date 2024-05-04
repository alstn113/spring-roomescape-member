package roomescape.domain;

import java.time.LocalTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public interface ReservationTimeRepository {

    List<ReservationTime> findAll();

    default ReservationTime getById(Long id) {
        return findById(id)
                .orElseThrow(() -> new NoSuchElementException("해당 id의 예약 시간이 존재하지 않습니다."));
    }

    Optional<ReservationTime> findById(Long id);

    ReservationTime save(ReservationTime reservationTime);

    void deleteById(Long id);

    boolean existsById(Long id);

    boolean existsByStartAt(LocalTime startAt);
}
