package food;

import java.time.LocalDate;
import java.util.UUID;
import java.util.function.Supplier;

public record Food(LocalDate expirationDate, Boolean approvedForConsumption, UUID inspectorId) {

    public boolean isEdible(Supplier<LocalDate> now) {
        return isFresh(now) && isConsumable() && hasBeenInspected();
    }

    private boolean isFresh(Supplier<LocalDate> now) {
        return this.expirationDate.isAfter(now.get());
    }

    private boolean isConsumable() {
        return this.approvedForConsumption;
    }

    private boolean hasBeenInspected() {
        return this.inspectorId != null;
    }
}