package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Mutazione
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class MutazioneResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public MutazioneResponseProjection() {
    }

    public MutazioneResponseProjection(MutazioneResponseProjection projection) {
        super(projection);
    }

    public MutazioneResponseProjection(List<MutazioneResponseProjection> projections) {
        super(projections);
    }

    public MutazioneResponseProjection all$() {
        return all$(3);
    }

    public MutazioneResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.aa1();
        this.aa2();
        this.aa3();
        this.aa4();
        this.aa5();
        this.deletion();
        this.insert();
        this.no_farmaco();
        this.object_title();
        this.posizione();
        this.regione_genoma();
        this.shift();
        this.temp_id();
        if (projectionDepthOnFields.getOrDefault("MutazioneResponseProjection.Sequenza_genomicaResponseProjection.Sequenza_genomica_mutazione", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutazioneResponseProjection.Sequenza_genomicaResponseProjection.Sequenza_genomica_mutazione", projectionDepthOnFields.getOrDefault("MutazioneResponseProjection.Sequenza_genomicaResponseProjection.Sequenza_genomica_mutazione", 0) + 1);
            this.Sequenza_genomica_mutazione(new Sequenza_genomicaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutazioneResponseProjection.Sequenza_genomicaResponseProjection.Sequenza_genomica_mutazione", 0)));
        }
        this.typename();
        return this;
    }

    public MutazioneResponseProjection _clientId() {
        return _clientId(null);
    }

    public MutazioneResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public MutazioneResponseProjection _createdby() {
        return _createdby(null);
    }

    public MutazioneResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public MutazioneResponseProjection _createdon() {
        return _createdon(null);
    }

    public MutazioneResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public MutazioneResponseProjection _id() {
        return _id(null);
    }

    public MutazioneResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public MutazioneResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public MutazioneResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public MutazioneResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public MutazioneResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public MutazioneResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public MutazioneResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public MutazioneResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public MutazioneResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public MutazioneResponseProjection aa1() {
        return aa1(null);
    }

    public MutazioneResponseProjection aa1(String alias) {
        add$(new GraphQLResponseField("aa1").alias(alias));
        return this;
    }

    public MutazioneResponseProjection aa2() {
        return aa2(null);
    }

    public MutazioneResponseProjection aa2(String alias) {
        add$(new GraphQLResponseField("aa2").alias(alias));
        return this;
    }

    public MutazioneResponseProjection aa3() {
        return aa3(null);
    }

    public MutazioneResponseProjection aa3(String alias) {
        add$(new GraphQLResponseField("aa3").alias(alias));
        return this;
    }

    public MutazioneResponseProjection aa4() {
        return aa4(null);
    }

    public MutazioneResponseProjection aa4(String alias) {
        add$(new GraphQLResponseField("aa4").alias(alias));
        return this;
    }

    public MutazioneResponseProjection aa5() {
        return aa5(null);
    }

    public MutazioneResponseProjection aa5(String alias) {
        add$(new GraphQLResponseField("aa5").alias(alias));
        return this;
    }

    public MutazioneResponseProjection deletion() {
        return deletion(null);
    }

    public MutazioneResponseProjection deletion(String alias) {
        add$(new GraphQLResponseField("deletion").alias(alias));
        return this;
    }

    public MutazioneResponseProjection insert() {
        return insert(null);
    }

    public MutazioneResponseProjection insert(String alias) {
        add$(new GraphQLResponseField("insert").alias(alias));
        return this;
    }

    public MutazioneResponseProjection no_farmaco() {
        return no_farmaco(null);
    }

    public MutazioneResponseProjection no_farmaco(String alias) {
        add$(new GraphQLResponseField("no_farmaco").alias(alias));
        return this;
    }

    public MutazioneResponseProjection object_title() {
        return object_title(null);
    }

    public MutazioneResponseProjection object_title(String alias) {
        add$(new GraphQLResponseField("object_title").alias(alias));
        return this;
    }

    public MutazioneResponseProjection posizione() {
        return posizione(null);
    }

    public MutazioneResponseProjection posizione(String alias) {
        add$(new GraphQLResponseField("posizione").alias(alias));
        return this;
    }

    public MutazioneResponseProjection regione_genoma() {
        return regione_genoma(null);
    }

    public MutazioneResponseProjection regione_genoma(String alias) {
        add$(new GraphQLResponseField("regione_genoma").alias(alias));
        return this;
    }

    public MutazioneResponseProjection shift() {
        return shift(null);
    }

    public MutazioneResponseProjection shift(String alias) {
        add$(new GraphQLResponseField("shift").alias(alias));
        return this;
    }

    public MutazioneResponseProjection temp_id() {
        return temp_id(null);
    }

    public MutazioneResponseProjection temp_id(String alias) {
        add$(new GraphQLResponseField("temp_id").alias(alias));
        return this;
    }

    public MutazioneResponseProjection Sequenza_genomica_mutazione(Sequenza_genomicaResponseProjection subProjection) {
        return Sequenza_genomica_mutazione(null, subProjection);
    }

    public MutazioneResponseProjection Sequenza_genomica_mutazione(String alias, Sequenza_genomicaResponseProjection subProjection) {
        add$(new GraphQLResponseField("Sequenza_genomica_mutazione").alias(alias).projection(subProjection));
        return this;
    }

    public MutazioneResponseProjection typename() {
        return typename(null);
    }

    public MutazioneResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public MutazioneResponseProjection deepCopy$() {
        return new MutazioneResponseProjection(this);
    }


}
