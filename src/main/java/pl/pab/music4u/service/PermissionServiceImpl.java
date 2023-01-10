package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.PermissionEntity;
import pl.pab.music4u.exception.PermissionNotFoundException;
import pl.pab.music4u.mapper.PermissionMapper;
import pl.pab.music4u.repository.PermissionRepository;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements  PermissionService{
    private final PermissionRepository permissionRepository;
    private final PermissionMapper permissionMapper;
    @Override
    public PermissionEntity findById(Long id) {
        return permissionRepository.findById(id).orElseThrow(PermissionNotFoundException::new);
    }

    @Override
    public Long map(PermissionEntity permissionEntity) {
        return permissionEntity.getId();
    }
}
