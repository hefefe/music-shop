package pl.pab.music4u.service;

import pl.pab.music4u.entity.PermissionEntity;

public interface PermissionService {
    PermissionEntity findById(Long id);
    Long map(PermissionEntity permissionEntity);
}
