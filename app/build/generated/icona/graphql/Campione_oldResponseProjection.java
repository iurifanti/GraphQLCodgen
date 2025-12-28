package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for campione_old
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Campione_oldResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Campione_oldResponseProjection() {
    }

    public Campione_oldResponseProjection(Campione_oldResponseProjection projection) {
        super(projection);
    }

    public Campione_oldResponseProjection(List<Campione_oldResponseProjection> projections) {
        super(projections);
    }

    public Campione_oldResponseProjection all$() {
        return all$(3);
    }

    public Campione_oldResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.campione();
        this.centro_icona();
        this.data_prelievo();
        this.etichetta();
        this.id_campione();
        this.note_campione();
        this.object_title();
        this.paziente_hepaicona();
        this.paziente_icona();
        this.paziente_nascita();
        this.posizioni();
        this.provette_iniziali();
        this.provette_rimanenti();
        this.qt();
        this.quantita();
        this.rack();
        this.sede_biobanca();
        this.um();
        if (projectionDepthOnFields.getOrDefault("Campione_oldResponseProjection.Sede_biobancaPageResponseProjection.sede_biobanca____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Campione_oldResponseProjection.Sede_biobancaPageResponseProjection.sede_biobanca____associables", projectionDepthOnFields.getOrDefault("Campione_oldResponseProjection.Sede_biobancaPageResponseProjection.sede_biobanca____associables", 0) + 1);
            this.sede_biobanca____associables(new Sede_biobancaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Campione_oldResponseProjection.Sede_biobancaPageResponseProjection.sede_biobanca____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Campione_oldResponseProjection.Sede_biobancaResponseProjection.sede_biobanca_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Campione_oldResponseProjection.Sede_biobancaResponseProjection.sede_biobanca_", projectionDepthOnFields.getOrDefault("Campione_oldResponseProjection.Sede_biobancaResponseProjection.sede_biobanca_", 0) + 1);
            this.sede_biobanca_(new Sede_biobancaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Campione_oldResponseProjection.Sede_biobancaResponseProjection.sede_biobanca_", 0)));
        }
        this.typename();
        return this;
    }

    public Campione_oldResponseProjection _clientId() {
        return _clientId(null);
    }

    public Campione_oldResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection _createdby() {
        return _createdby(null);
    }

    public Campione_oldResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection _createdon() {
        return _createdon(null);
    }

    public Campione_oldResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection _id() {
        return _id(null);
    }

    public Campione_oldResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Campione_oldResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Campione_oldResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Campione_oldResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Campione_oldResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection campione() {
        return campione(null);
    }

    public Campione_oldResponseProjection campione(String alias) {
        add$(new GraphQLResponseField("campione").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection centro_icona() {
        return centro_icona(null);
    }

    public Campione_oldResponseProjection centro_icona(String alias) {
        add$(new GraphQLResponseField("centro_icona").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection data_prelievo() {
        return data_prelievo(null);
    }

    public Campione_oldResponseProjection data_prelievo(String alias) {
        add$(new GraphQLResponseField("data_prelievo").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection etichetta() {
        return etichetta(null);
    }

    public Campione_oldResponseProjection etichetta(String alias) {
        add$(new GraphQLResponseField("etichetta").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection id_campione() {
        return id_campione(null);
    }

    public Campione_oldResponseProjection id_campione(String alias) {
        add$(new GraphQLResponseField("id_campione").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection note_campione() {
        return note_campione(null);
    }

    public Campione_oldResponseProjection note_campione(String alias) {
        add$(new GraphQLResponseField("note_campione").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection object_title() {
        return object_title(null);
    }

    public Campione_oldResponseProjection object_title(String alias) {
        add$(new GraphQLResponseField("object_title").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection paziente_hepaicona() {
        return paziente_hepaicona(null);
    }

    public Campione_oldResponseProjection paziente_hepaicona(String alias) {
        add$(new GraphQLResponseField("paziente_hepaicona").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection paziente_icona() {
        return paziente_icona(null);
    }

    public Campione_oldResponseProjection paziente_icona(String alias) {
        add$(new GraphQLResponseField("paziente_icona").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection paziente_nascita() {
        return paziente_nascita(null);
    }

    public Campione_oldResponseProjection paziente_nascita(String alias) {
        add$(new GraphQLResponseField("paziente_nascita").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection posizioni() {
        return posizioni(null);
    }

    public Campione_oldResponseProjection posizioni(String alias) {
        add$(new GraphQLResponseField("posizioni").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection provette_iniziali() {
        return provette_iniziali(null);
    }

    public Campione_oldResponseProjection provette_iniziali(String alias) {
        add$(new GraphQLResponseField("provette_iniziali").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection provette_rimanenti() {
        return provette_rimanenti(null);
    }

    public Campione_oldResponseProjection provette_rimanenti(String alias) {
        add$(new GraphQLResponseField("provette_rimanenti").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection qt() {
        return qt(null);
    }

    public Campione_oldResponseProjection qt(String alias) {
        add$(new GraphQLResponseField("qt").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection quantita() {
        return quantita(null);
    }

    public Campione_oldResponseProjection quantita(String alias) {
        add$(new GraphQLResponseField("quantita").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection rack() {
        return rack(null);
    }

    public Campione_oldResponseProjection rack(String alias) {
        add$(new GraphQLResponseField("rack").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection sede_biobanca() {
        return sede_biobanca(null);
    }

    public Campione_oldResponseProjection sede_biobanca(String alias) {
        add$(new GraphQLResponseField("sede_biobanca").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection um() {
        return um(null);
    }

    public Campione_oldResponseProjection um(String alias) {
        add$(new GraphQLResponseField("um").alias(alias));
        return this;
    }

    public Campione_oldResponseProjection sede_biobanca____associables(Sede_biobancaPageResponseProjection subProjection) {
        return sede_biobanca____associables((String)null, subProjection);
    }

    public Campione_oldResponseProjection sede_biobanca____associables(String alias, Sede_biobancaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sede_biobanca____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Campione_oldResponseProjection sede_biobanca____associables(Campione_oldSede_biobanca____associablesParametrizedInput input, Sede_biobancaPageResponseProjection subProjection) {
        return sede_biobanca____associables(null, input, subProjection);
    }

    public Campione_oldResponseProjection sede_biobanca____associables(String alias, Campione_oldSede_biobanca____associablesParametrizedInput input, Sede_biobancaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sede_biobanca____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Campione_oldResponseProjection sede_biobanca_(Sede_biobancaResponseProjection subProjection) {
        return sede_biobanca_(null, subProjection);
    }

    public Campione_oldResponseProjection sede_biobanca_(String alias, Sede_biobancaResponseProjection subProjection) {
        add$(new GraphQLResponseField("sede_biobanca_").alias(alias).projection(subProjection));
        return this;
    }

    public Campione_oldResponseProjection typename() {
        return typename(null);
    }

    public Campione_oldResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Campione_oldResponseProjection deepCopy$() {
        return new Campione_oldResponseProjection(this);
    }


}
