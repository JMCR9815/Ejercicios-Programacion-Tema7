package Ejercicio_Producto;

public class Producto {
    private int codObjeto;
    private String nameProduct;
    private Tipo tipo;
    private int sellPrice;
    private int buyPrice;
    private int udsDisponile;

    /**
     * @param codObjeto
     * @param nameProduct
     * @param tipo
     * @param sellPrice
     * @param buyPrice
     * @param udsDisponile
     */
    public Producto(int codObjeto, String nameProduct, Tipo tipo, int sellPrice, int buyPrice, int udsDisponile) {
        super();
        this.codObjeto = codObjeto;
        this.nameProduct = nameProduct;
        this.tipo = tipo;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.udsDisponile = udsDisponile;
    }

    /**
     * @return the codObjeto
     */
    public int getCodObjeto() {
        return codObjeto;
    }

    /**
     * @param codObjeto the codObjeto to set
     */
    public void setCodObjeto(int codObjeto) {
        this.codObjeto = codObjeto;
    }

    /**
     * @return the nameProduct
     */
    public String getNameProduct() {
        return nameProduct;
    }

    /**
     * @param nameProduct the nameProduct to set
     */
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the sellPrice
     */
    public int getSellPrice() {
        return sellPrice;
    }

    /**
     * @param sellPrice the sellPrice to set
     */
    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * @return the buyPrice
     */
    public int getBuyPrice() {
        return buyPrice;
    }

    /**
     * @param buyPrice the buyPrice to set
     */
    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * @return the udsDisponile
     */
    public int getUdsDisponile() {
        return udsDisponile;
    }

    /**
     * @param udsDisponile the udsDisponile to set
     */
    public void setUdsDisponile(int udsDisponile) {
        this.udsDisponile = udsDisponile;
    }

    @Override
    public String toString() {
        return "Producto: Codigo Producto: " + codObjeto + "; Nombre: " + nameProduct + "; TIpo: " + tipo
                + "; Precio venta: " + sellPrice + "; Precio compra: " + buyPrice + ", Unidades disponibles: "
                + udsDisponile + ";";
    }

}
