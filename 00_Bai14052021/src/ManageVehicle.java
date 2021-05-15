public interface ManageVehicle {
    Vehicle[] addVehicle(Vehicle[] arr, int size);

    Vehicle[] editVehicle(Vehicle[] arr, int size);

    Vehicle[] deleteVehicle(Vehicle[] arr, int size);

    Vehicle[] findVehicle(Vehicle[] arr, int size);

    long costVehicle();
}
