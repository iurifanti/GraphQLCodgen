package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the lock and unlock services.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliLockStatusResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean locked;
    private int minutes;

    public CliLockStatusResultDTO() {
    }


    public boolean getLocked() {
        return locked;
    }
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("locked: " + GraphQLRequestSerializer.getEntry(locked));
        joiner.add("minutes: " + GraphQLRequestSerializer.getEntry(minutes));
        return joiner.toString();
    }

    public static CliLockStatusResultDTO.Builder builder() {
        return new CliLockStatusResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private boolean locked;
        private int minutes;

        public Builder() {
        }

        public Builder setLocked(boolean locked) {
            this.locked = locked;
            return this;
        }

        public Builder setMinutes(int minutes) {
            this.minutes = minutes;
            return this;
        }


        public CliLockStatusResultDTO build() {
            CliLockStatusResultDTO result = new CliLockStatusResultDTO();
            result.setLocked(this.locked);
            result.setMinutes(this.minutes);
            return result;
        }

    }
}
