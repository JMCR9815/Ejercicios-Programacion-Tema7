package Productos;

import java.time.LocalDate;

public class Refrigerados extends Productos {
    private String codigoOrgSupervisionAlimentaria;

    public Refrigerados(String id_Producto, String descripcion, LocalDate fecha_Caaducidad, int numLote, String codigoOrgSupervisionAlimentaria) {
        super(id_Producto, descripcion, fecha_Caaducidad, numLote);
        this.codigoOrgSupervisionAlimentaria = codigoOrgSupervisionAlimentaria;
    }

    public String getCodigoOrgSupervisionAlimentaria() {
        return codigoOrgSupervisionAlimentaria;
    }

    public void setCodigoOrgSupervisionAlimentaria(String codigoOrgSupervisionAlimentaria) {
        this.codigoOrgSupervisionAlimentaria = codigoOrgSupervisionAlimentaria;
    }

    @Override
    public String toString() {
        return "Producto: Refrigerado => " + super.toString() + "Codigo del organismo de supervisión alimentaria: " + codigoOrgSupervisionAlimentaria + " .";
    }
}
