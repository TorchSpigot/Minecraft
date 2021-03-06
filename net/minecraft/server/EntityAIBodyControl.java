package net.minecraft.server;

public class EntityAIBodyControl {

    private final EntityLiving a;
    private int b;
    private float c;

    public EntityAIBodyControl(EntityLiving entityliving) {
        this.a = entityliving;
    }

    public void a() {
        double d0 = this.a.locX - this.a.lastX;
        double d1 = this.a.locZ - this.a.lastZ;

        if (d0 * d0 + d1 * d1 > 2.500000277905201E-7D) {
            this.a.aQ = this.a.yaw;
            this.a.aS = this.a(this.a.aQ, this.a.aS, 75.0F);
            this.c = this.a.aS;
            this.b = 0;
        } else {
            if (this.a.bP().isEmpty() || !(this.a.bP().get(0) instanceof EntityInsentient)) {
                float f = 75.0F;

                if (Math.abs(this.a.aS - this.c) > 15.0F) {
                    this.b = 0;
                    this.c = this.a.aS;
                } else {
                    ++this.b;
                    boolean flag = true;

                    if (this.b > 10) {
                        f = Math.max(1.0F - (float) (this.b - 10) / 10.0F, 0.0F) * 75.0F;
                    }
                }

                this.a.aQ = this.a(this.a.aS, this.a.aQ, f);
            }

        }
    }

    private float a(float f, float f1, float f2) {
        float f3 = MathHelper.g(f - f1);

        if (f3 < -f2) {
            f3 = -f2;
        }

        if (f3 >= f2) {
            f3 = f2;
        }

        return f - f3;
    }
}
