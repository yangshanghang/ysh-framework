/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.ysh.framework.scene.service.impl;

import com.ysh.framework.scene.mapper.SceneMapper;
import com.ysh.framework.scene.model.Scene;
import com.ysh.framework.scene.service.ISceneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述: 场景配置表 CMS_SCENE 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年04月11日
 */
@Service
public class SceneServiceImpl implements ISceneService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(SceneServiceImpl.class);

    /**
     * 注入场景配置服务
     */
    @Autowired
    private SceneMapper sceneMapper;

    /**
     * 根据id获取场景信息
     *
     * @param id 场景id
     * @return 场景信息
     * @throws Exception
     */
    @Override
    public Scene getById(String id) throws Exception {
        return sceneMapper.selectByPrimaryKey(id);
    }

    /**
     * 获取场景列表
     *
     * @return 场景列表
     * @throws Exception
     */
    @Override
    public List<Scene> getList() throws Exception {
        return sceneMapper.selectAll();
    }
}