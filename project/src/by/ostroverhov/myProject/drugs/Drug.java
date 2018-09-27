package by.ostroverhov.myProject.drugs;

import java.util.Date;

public class Drug {
    private int id;
    private String name;
    private String drugform;
    private String batch;
    private Date productionDate;
    private Boolean qualityControl;
    private int amountPackages;

    public Drug(int id, String name, String drugform, String batch, Date productionDate, Boolean qualityControl, int amountPackages) {
        this.id = id;
        this.name = name;
        this.drugform = drugform;
        this.batch = batch;
        this.productionDate = productionDate;
        this.qualityControl = qualityControl;
        this.amountPackages = amountPackages;
    }

    public String getName() {
        return name;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public String getBatch() {
        return batch;
    }

    @Override
    public String toString() {
        return "препарат{" +
                "номер=" + id +
                ", название='" + name + '\'' +
                ", лекформа='" + drugform + '\'' +
                ", серия=" + batch +
                ", дата производства=" + productionDate +
                ", контроль качества=" + qualityControl +
                ", количество упаковок=" + amountPackages +
                '}';
    }
}