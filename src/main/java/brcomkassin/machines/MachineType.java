package brcomkassin.machines;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MachineType {

    DROP("machine-drop");

    private final String data;

    public boolean getMachine() {
    }

}
