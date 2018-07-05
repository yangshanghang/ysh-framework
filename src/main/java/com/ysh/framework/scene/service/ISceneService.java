/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.ysh.framework.scene.service;

import com.ysh.framework.scene.model.Scene;

import java.util.List;

/**
 * 描述: 场景配置表 CMS_SCENE 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年04月11日
 */
public interface ISceneService {

    /**
     * 根据id获取场景信息
     *
     * @param id 场景id
     * @return 场景信息
     * @throws Exception
     */
    Scene getById(String id) throws Exception;

    /**
     * 获取场景列表
     *
     * @return 场景列表
     * @throws Exception
     */
    List<Scene> getList() throws Exception;
}