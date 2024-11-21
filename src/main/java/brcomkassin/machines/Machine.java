package brcomkassin.machines;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;

import java.util.UUID;

@Getter
@Setter
public final class Machine {

    private String name;
    private UUID id;
    private Material drop;
    private String data;
    private MachineType type;
}
