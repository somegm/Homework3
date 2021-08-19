package Entities.concretes;

public class Game {
    public Game(){

    }
    public Game(int gameId, String gameName, double unitPrice, int stockAmount) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.unitPrice = unitPrice;
        this.stockAmount = stockAmount;
    }

    private int gameId;
    private String gameName;
    private double unitPrice;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    private int stockAmount;


}
