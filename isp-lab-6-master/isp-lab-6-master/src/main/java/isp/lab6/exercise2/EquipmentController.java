package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EquipmentController {

    ArrayList<Equipment> list = new ArrayList<>();

    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
        list.add(equipment);
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return list;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        return list.size();
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented
     * by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        Map<String, List<Equipment>> rez = list.stream().collect(Collectors.groupingBy(equipment -> equipment.getOwner()));
        return rez;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     *
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSerialNumber().equals(serialNumber)) {
                Equipment eq=list.get(i);
                list.remove(list.get(i));
                return eq;
            }
        }
        return null;
    }
}
