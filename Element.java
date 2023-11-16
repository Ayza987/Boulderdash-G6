package model.element;

import java.awt.Image;

import contract.IElement;
import contract.Permeability;
import fr.exia.showboard.ISquare;

/**
 * <h1>The Element Class.</h1>
 *
 * @author TCHUENTE
 *
 * @version 0.1
 * @see ISquare
 */

public abstract class Element implements IElement {

    /**
     * The sprite.
     */
    public Sprite sprite;

    /**
     * The permeability.
     */
    private Permeability permeability;

    /**
     * Instantiates a new element.
     *
     * @param sprite       the sprite
     * @param permeability the permeability
     */
    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

    /**
     * Gets the sprite.
     *
     * @return the sprite
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IElement#getSprite()
     */
    @Override
    public final Sprite getSprite() {
        return this.sprite;
    }

    /**
     * Sets the sprite.
     *
     * @param sprite the new sprite
     */
    protected final void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }

    /**
     * Gets permeability
     *
     * @return permeability
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IElement#getPermeability()
     */
    @Override
    public final Permeability getPermeability() {
        return this.permeability;
    }

    /**
     * Sets the permeability.
     *
     * @param permeability the new permeability
     */
    private void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

    /**
     * Gets the image
     *
     * @return getImage
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IElement#getImage()
     */
    @Override
    public final Image getImage() {
        return this.getSprite().getImage();
    }
}
