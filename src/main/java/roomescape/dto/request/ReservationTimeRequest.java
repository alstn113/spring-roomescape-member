package roomescape.dto.request;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalTime;
import roomescape.domain.reservationtime.ReservationTime;

public record ReservationTimeRequest(
        @NotBlank(message = "예약 시작 시간을 입력해주세요.")
        LocalTime startAt
) {

    public ReservationTime toReservationTime() {
        return new ReservationTime(startAt);
    }
}
