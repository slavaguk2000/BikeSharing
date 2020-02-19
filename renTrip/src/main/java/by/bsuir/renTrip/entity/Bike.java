package by.bsuir.renTrip.entity;

public class Bike extends Entity {
    private String name;
    private String description;
    private String image;
    private String address;
    private double cost;
    private long rentTime;
    private boolean status;

    public Bike() {
    }

    public Bike(String name, double cost, String address , String description, String image) {
        this.name = name;
        this.cost = cost;
        this.address = address;
        this.description = description;
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getRentTime() {
        return rentTime;
    }

    public void setRentTime(long rentTime) {
        this.rentTime = rentTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bike{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", image='").append(image).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", cost=").append(cost);
        sb.append(", rentTime=").append(rentTime);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bike bike = (Bike) o;

        if (Double.compare(bike.cost, cost) != 0) return false;
        if (rentTime != bike.rentTime) return false;
        if (status != bike.status) return false;
        if (name != null ? !name.equals(bike.name) : bike.name != null) return false;
        if (description != null ? !description.equals(bike.description) : bike.description != null) return false;
        if (image != null ? !image.equals(bike.image) : bike.image != null) return false;
        return address != null ? address.equals(bike.address) : bike.address == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (rentTime ^ (rentTime >>> 32));
        result = 31 * result + (status ? 1 : 0);
        return result;
    }
}
