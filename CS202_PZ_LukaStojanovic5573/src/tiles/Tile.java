package tiles;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import units.Unit;
import javafx.scene.paint.Color;

public class Tile extends Pane {
    private TileType tileType;
    private boolean isOccupied;
    private Unit occupyingUnit; // Assuming there's a Unit class
    private Rectangle visualRepresentation;

    public Tile(TileType tileType, boolean isOccupied, Unit occupyingUnit) {
        this.tileType = tileType;
        this.isOccupied = isOccupied;
        this.occupyingUnit = occupyingUnit;

        initializeVisuals();
    }

    private void initializeVisuals() {
        visualRepresentation = new Rectangle(50, 50); // Tile size
        visualRepresentation.setFill(getColorForType(tileType));
        this.getChildren().add(visualRepresentation);
    }

    private Color getColorForType(TileType type) {
        switch (type) {
            case GRASS: return Color.GREEN;
            case WATER: return Color.BLUE;
            case MOUNTAIN: return Color.GREY;
            case CITY: return Color.BEIGE;
            case FACTORY: return Color.RED;
            default: return Color.WHITE;
        }
    }

}
