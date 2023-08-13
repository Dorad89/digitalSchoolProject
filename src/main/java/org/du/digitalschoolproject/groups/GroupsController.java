package org.du.digitalschoolproject.groups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupsController {

    private GroupsRepository groupsRepository;

    @Autowired
    public GroupsController(GroupsRepository groupsRepository) {
        this.groupsRepository = groupsRepository;
    }
}
