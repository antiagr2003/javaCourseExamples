package ui.objetos;

import app.Juego;

public class Misil extends Sprite
{
    private static final String NOMBRE_IMAGEN = "misil.png";
    private static final float VELOCIDAD_DEFAULT = 3;

    public Misil(int x, int y)
    {
        super(x, y, VELOCIDAD_DEFAULT, NOMBRE_IMAGEN);
    }

    public void checkImpacto(Sprite sprite) {
        if(this.getRectangulo().intersects(sprite.getRectangulo())
                && sprite.isVisible() && this.isVisible()) {
            sprite.colision();
            this.colision();
        }
    }

    public void colision()
    {
        this.setVisible(false);
    }
}