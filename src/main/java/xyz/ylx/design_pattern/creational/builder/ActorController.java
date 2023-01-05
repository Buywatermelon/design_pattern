package xyz.ylx.design_pattern.creational.builder;

// 游戏角色控制器：指挥者
public class ActorController {

    // 逐步构建复杂产品
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        // 通过钩子方法来控制产品的构建
        if (!ab.isBareheaded()) {
            ab.buildHairstyle();
        }
        actor = ab.createActor();
        return actor;
    }
}
