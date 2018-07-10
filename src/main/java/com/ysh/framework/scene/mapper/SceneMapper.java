package com.ysh.framework.scene.mapper;

import com.ysh.framework.scene.model.Scene;

import java.util.List;

public interface SceneMapper {
    int deleteByPrimaryKey(String id);

    int insert(Scene record);

    Scene selectByPrimaryKey(String id);

    List<Scene> selectAll();

    int updateByPrimaryKey(Scene record);

    /**
     * 批量保存
     *
     * @param list 对象集合
     * @throws Exception 异常
     */
    void batchInsert(List<Scene> list) throws Exception;

    /**
     * 获取满足条件的对象数量
     *
     * @param scene 对象
     * @return 对象数量
     * @throws Exception 异常
     */
    int selectCount(Scene scene) throws Exception;
}