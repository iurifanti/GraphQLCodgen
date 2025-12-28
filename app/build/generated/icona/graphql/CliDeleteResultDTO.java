package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the delete mutation.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliDeleteResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean deleted;

    public CliDeleteResultDTO() {
    }


    /**
     * A boolean indicating if the current operation
has caused the deletion of the object.
This means that in case of non existing object this value will be false.
     */
    public boolean getDeleted() {
        return deleted;
    }
    /**
     * A boolean indicating if the current operation
has caused the deletion of the object.
This means that in case of non existing object this value will be false.
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("deleted: " + GraphQLRequestSerializer.getEntry(deleted));
        return joiner.toString();
    }

    public static CliDeleteResultDTO.Builder builder() {
        return new CliDeleteResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private boolean deleted;

        public Builder() {
        }

        /**
         * A boolean indicating if the current operation
has caused the deletion of the object.
This means that in case of non existing object this value will be false.
         */
        public Builder setDeleted(boolean deleted) {
            this.deleted = deleted;
            return this;
        }


        public CliDeleteResultDTO build() {
            CliDeleteResultDTO result = new CliDeleteResultDTO();
            result.setDeleted(this.deleted);
            return result;
        }

    }
}
