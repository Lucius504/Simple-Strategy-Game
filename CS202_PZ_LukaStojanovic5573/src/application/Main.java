package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tiles.Tile;
import tiles.TileType;

import java.util.Random;

public class Main extends Application {

    private static final int GRID_SIZE = 20;
    private static final int TILE_SIZE = 50; // Each tile is 50x50 pixels

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                Tile tile = new Tile(randomTileType(), false, null);
                grid.add(tile, i, j);
            }
        }

        Scene scene = new Scene(grid, GRID_SIZE * TILE_SIZE, GRID_SIZE * TILE_SIZE);
        primaryStage.setTitle("Simple Strategy Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private TileType randomTileType() {
        TileType[] types = TileType.values();
        Random random = new Random();
        return types[random.nextInt(types.length)];
    }

    public static void main(String[] args) {
        launch(args);
    }
}
