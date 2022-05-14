package net.gai.ibh.entity.custom;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class TestFlyingMoveControl extends MoveControl {
    private final Mob ghast;
    private int floatDuration;

    public TestFlyingMoveControl(Mob p_32768_) {
        super(p_32768_);
        this.ghast = p_32768_;
    }

    public void tick() {
        if (this.operation == MoveControl.Operation.MOVE_TO) {
            if (this.floatDuration-- <= 0) {
                this.floatDuration += this.ghast.getRandom().nextInt(5) + 2;
                Vec3 vec3 = new Vec3(this.wantedX - this.ghast.getX(), this.wantedY - this.ghast.getY(), this.wantedZ - this.ghast.getZ());
                double d0 = vec3.length();
                vec3 = vec3.normalize();
                if (this.canReach(vec3, Mth.ceil(d0))) {
                    this.ghast.setDeltaMovement(this.ghast.getDeltaMovement().add(vec3.scale(0.1D)));
                } else {
                    this.operation = MoveControl.Operation.WAIT;
                }
            }

        }
    }

    private boolean canReach(Vec3 p_32771_, int p_32772_) {
        AABB aabb = this.ghast.getBoundingBox();

        for(int i = 1; i < p_32772_; ++i) {
            aabb = aabb.move(p_32771_);
            if (!this.ghast.level.noCollision(this.ghast, aabb)) {
                return false;
            }
        }

        return true;
    }
}
