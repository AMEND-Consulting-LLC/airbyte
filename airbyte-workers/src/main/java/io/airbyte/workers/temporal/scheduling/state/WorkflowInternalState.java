/*
 * Copyright (c) 2021 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.workers.temporal.scheduling.state;

import io.airbyte.config.FailureReason;
import java.time.Instant;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WorkflowInternalState {

  private Long jobId = null;
  private Integer attemptNumber = null;

  // StandardSyncOutput standardSyncOutput = null;
  private final Set<FailureReason> failures = new HashSet<>();
  private Boolean partialSuccess = null;

  private Optional<Instant> lastAutoDisableWarningTimestamp = Optional.empty();

}
