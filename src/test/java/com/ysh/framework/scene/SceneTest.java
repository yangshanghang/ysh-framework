package com.ysh.framework.scene;

import com.ysh.framework.scene.mapper.SceneMapper;
import com.ysh.framework.scene.model.Scene;
import com.ysh.framework.scene.service.ISceneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * 描述: 测试类 .<br>
 *
 * @author YangShangHang
 * @date 2018/7/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class SceneTest {

    @Autowired
    private ISceneService sceneService;

    @Autowired
    private SceneMapper sceneMapper;


    @Test
    public void getListTest() {
        try {
            List<Scene> list = sceneService.getList();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insertTest() {
        try {
            Scene scene = new Scene();
            scene.setTerminal("0");
            scene.setModule("0");
            scene.setHeight(111);
            scene.setWidth(222);
            scene.setIdentification("场景标识");
            scene.setName("场景名称");
            scene.setStatus("1");
            scene.setCreateTime(new Date());
            scene.setCreator("ysh");
            scene.setOperateTime(new Date());
            scene.setOperator("ysh");
            sceneMapper.insert(scene);
            System.out.println("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
