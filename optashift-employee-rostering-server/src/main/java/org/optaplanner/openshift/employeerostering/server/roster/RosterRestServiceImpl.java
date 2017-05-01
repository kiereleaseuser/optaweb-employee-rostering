/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.openshift.employeerostering.server.roster;

import java.util.List;

import javax.inject.Inject;

import org.optaplanner.openshift.employeerostering.server.roster.RosterDao;
import org.optaplanner.openshift.employeerostering.shared.domain.Roster;
import org.optaplanner.openshift.employeerostering.shared.rest.RosterRestService;

public class RosterRestServiceImpl implements RosterRestService {

    @Inject
    private RosterDao rosterDao;

    @Override
    public Roster getRoster(Long id) {
        return rosterDao.getRoster(id);
    }

    @Override
    public List<Roster> getRosterList() {
        return rosterDao.getRosterList();
    }

}
