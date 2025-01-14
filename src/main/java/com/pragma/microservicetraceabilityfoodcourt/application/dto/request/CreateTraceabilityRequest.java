package com.pragma.microservicetraceabilityfoodcourt.application.dto.request;

import com.pragma.microservicetraceabilityfoodcourt.application.constant.TraceabilityReqConstant;
import com.pragma.microservicetraceabilityfoodcourt.domain.model.enums.OrderStatus;
import lombok.Builder;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Builder
public record CreateTraceabilityRequest(
        @NotNull(message = TraceabilityReqConstant.MSG_ORDER_ID_IS_POSITIVE)
        @Positive
        Long orderId,

        @NotBlank(message = TraceabilityReqConstant.MSG_CLIENT_ID_IS_REQUIRED)
        String clientId,

        @NotBlank(message = TraceabilityReqConstant.MSG_CLIENT_EMAIL_IS_REQUIRED)
        @Email(message = TraceabilityReqConstant.MSG_CLIENT_EMAIL_FORMAT)
        String clientEmail,

        @NotBlank(message = TraceabilityReqConstant.RESTAURANT_NIT_IS_REQUIRED)
        String restaurantNit,

        @PastOrPresent
        LocalDateTime startTime,

        OrderStatus newStatus
) {
}
