package br.com.pamela.calendario.modules.event.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateEventDTO {
  private UUID userId;

  private LocalDateTime startDateTime;

  private LocalDateTime endDateTime;

  private String description;

}
