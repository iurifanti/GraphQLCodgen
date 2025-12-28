package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Combinazioni_accettate_non_ARV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliCombinazioni_accettate_non_ARVCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String farmaci;

    public CliCombinazioni_accettate_non_ARVCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFarmaci() {
        return farmaci;
    }
    public void setFarmaci(String farmaci) {
        this.farmaci = farmaci;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (farmaci != null) {
            joiner.add("farmaci: " + GraphQLRequestSerializer.getEntry(farmaci));
        }
        return joiner.toString();
    }

    public static CliCombinazioni_accettate_non_ARVCursorDTO.Builder builder() {
        return new CliCombinazioni_accettate_non_ARVCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String farmaci;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setFarmaci(String farmaci) {
            this.farmaci = farmaci;
            return this;
        }


        public CliCombinazioni_accettate_non_ARVCursorDTO build() {
            CliCombinazioni_accettate_non_ARVCursorDTO result = new CliCombinazioni_accettate_non_ARVCursorDTO();
            result.set_id(this._id);
            result.setFarmaci(this.farmaci);
            return result;
        }

    }
}
