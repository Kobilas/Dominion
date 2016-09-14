package mkobilas.game.Dominion;
import java.awt.*;

public class Shooting
{
    public static Rectangle Bullet;
    static boolean u;
    static boolean d;
    static boolean l;
    static boolean r;
    public static void ShootBullet(int x, int y, boolean up, boolean down, boolean left, boolean right)
    {
        Bullet = new Rectangle(x, y, 20,20);
        u = up;
        d = down;
        l = left;
        r = right;
        move();
    }
    public static void move()
    {
        if(u)
        {
            for(int i=0; i<21; i++)
            {
                Bullet.y--;
            }
        }
        if(d)
        {
            for(int i=0; i<21; i++)
            {
                Bullet.y++;
            }
        }
        if(r)
        {
            for(int i=0; i<21; i++)
            {
                Bullet.x++;
            }
        }
        if(l)
        {
            for(int i=0; i<21; i++)
            {
                Bullet.x--;
            }
        }
    }
}


