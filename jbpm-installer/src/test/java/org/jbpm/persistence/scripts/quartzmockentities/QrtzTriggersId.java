/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.persistence.scripts.quartzmockentities;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class QrtzTriggersId implements Serializable{

    private static final long serialVersionUID = 1L;
    private String schedulerName;
    private String triggerName;
    private String triggerGroup;

    public QrtzTriggersId schedulerName(final String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    public QrtzTriggersId triggerName(final String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    public QrtzTriggersId triggerGroup(final String triggerGroup) {
        this.triggerGroup = triggerGroup;
        return this;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof QrtzTriggersId)) {
            return false;
        }
        QrtzTriggersId q = (QrtzTriggersId) o;
        return new EqualsBuilder()
                  .append(schedulerName, q.schedulerName)
                  .append(triggerName, q.triggerName)
                  .append(triggerGroup, q.triggerGroup)
                  .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                   .append(schedulerName)
                   .append(triggerName)
                   .append(triggerGroup)
                   .toHashCode();
    }
}