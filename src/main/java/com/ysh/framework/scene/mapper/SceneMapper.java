package com.ysh.framework.scene.mapper;

import com.ysh.framework.scene.model.Scene;
import java.util.List;

public interface SceneMapper {
    int deleteByPrimaryKey(String id);

    int insert(Scene record);

    Scene selectByPrimaryKey(String id);

    List<Scene> selectAll();

    int updateByPrimaryKey(Scene record);
}