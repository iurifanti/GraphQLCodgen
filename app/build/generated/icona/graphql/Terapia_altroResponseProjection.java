package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Terapia_altro
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_altroResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Terapia_altroResponseProjection() {
    }

    public Terapia_altroResponseProjection(Terapia_altroResponseProjection projection) {
        super(projection);
    }

    public Terapia_altroResponseProjection(List<Terapia_altroResponseProjection> projections) {
        super(projections);
    }

    public Terapia_altroResponseProjection all$() {
        return all$(3);
    }

    public Terapia_altroResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.altra_motivazione_fine();
        this.altro_farmaco();
        this.codice_centro();
        this.count_dosaggi();
        this.data_fine();
        this.data_inizio();
        this.dosaggio();
        this.epatica();
        this.farmaco_ATC();
        this.motivazione_fine();
        this.nome_farmaco();
        this.nome_gruppo();
        this.nome_tipo();
        this.object_title();
        this.ricerca_farmaco();
        if (projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.DosaggioPageResponseProjection.dosaggio____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_altroResponseProjection.DosaggioPageResponseProjection.dosaggio____associables", projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.DosaggioPageResponseProjection.dosaggio____associables", 0) + 1);
            this.dosaggio____associables(new DosaggioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.DosaggioPageResponseProjection.dosaggio____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.DosaggioResponseProjection.dosaggio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_altroResponseProjection.DosaggioResponseProjection.dosaggio_", projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.DosaggioResponseProjection.dosaggio_", 0) + 1);
            this.dosaggio_(new DosaggioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.DosaggioResponseProjection.dosaggio_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_altroPageResponseProjection.farmaco___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_altroResponseProjection.Farmaco_altroPageResponseProjection.farmaco___associables", projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_altroPageResponseProjection.farmaco___associables", 0) + 1);
            this.farmaco___associables(new Farmaco_altroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_altroPageResponseProjection.farmaco___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_altroResponseProjection.farmaco", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_altroResponseProjection.Farmaco_altroResponseProjection.farmaco", projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_altroResponseProjection.farmaco", 0) + 1);
            this.farmaco(new Farmaco_altroResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_altroResponseProjection.farmaco", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_ATCPageResponseProjection.farmaco_ATC____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_altroResponseProjection.Farmaco_ATCPageResponseProjection.farmaco_ATC____associables", projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_ATCPageResponseProjection.farmaco_ATC____associables", 0) + 1);
            this.farmaco_ATC____associables(new Farmaco_ATCPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_ATCPageResponseProjection.farmaco_ATC____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_ATCResponseProjection.farmaco_ATC_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_altroResponseProjection.Farmaco_ATCResponseProjection.farmaco_ATC_", projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_ATCResponseProjection.farmaco_ATC_", 0) + 1);
            this.farmaco_ATC_(new Farmaco_ATCResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.Farmaco_ATCResponseProjection.farmaco_ATC_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.PazienteResponseProjection.Paziente_terapia_altro", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_altroResponseProjection.PazienteResponseProjection.Paziente_terapia_altro", projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.PazienteResponseProjection.Paziente_terapia_altro", 0) + 1);
            this.Paziente_terapia_altro(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.PazienteResponseProjection.Paziente_terapia_altro", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.PazienteResponseProjection.paziente_epatica", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_altroResponseProjection.PazienteResponseProjection.paziente_epatica", projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.PazienteResponseProjection.paziente_epatica", 0) + 1);
            this.paziente_epatica(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_altroResponseProjection.PazienteResponseProjection.paziente_epatica", 0)));
        }
        this.typename();
        return this;
    }

    public Terapia_altroResponseProjection _clientId() {
        return _clientId(null);
    }

    public Terapia_altroResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection _createdby() {
        return _createdby(null);
    }

    public Terapia_altroResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection _createdon() {
        return _createdon(null);
    }

    public Terapia_altroResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection _id() {
        return _id(null);
    }

    public Terapia_altroResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Terapia_altroResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Terapia_altroResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Terapia_altroResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Terapia_altroResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection altra_motivazione_fine() {
        return altra_motivazione_fine(null);
    }

    public Terapia_altroResponseProjection altra_motivazione_fine(String alias) {
        add$(new GraphQLResponseField("altra_motivazione_fine").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection altro_farmaco() {
        return altro_farmaco(null);
    }

    public Terapia_altroResponseProjection altro_farmaco(String alias) {
        add$(new GraphQLResponseField("altro_farmaco").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public Terapia_altroResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection count_dosaggi() {
        return count_dosaggi(null);
    }

    public Terapia_altroResponseProjection count_dosaggi(String alias) {
        add$(new GraphQLResponseField("count_dosaggi").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection data_fine() {
        return data_fine(null);
    }

    public Terapia_altroResponseProjection data_fine(String alias) {
        add$(new GraphQLResponseField("data_fine").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection data_inizio() {
        return data_inizio(null);
    }

    public Terapia_altroResponseProjection data_inizio(String alias) {
        add$(new GraphQLResponseField("data_inizio").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection dosaggio() {
        return dosaggio(null);
    }

    public Terapia_altroResponseProjection dosaggio(String alias) {
        add$(new GraphQLResponseField("dosaggio").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection epatica() {
        return epatica(null);
    }

    public Terapia_altroResponseProjection epatica(String alias) {
        add$(new GraphQLResponseField("epatica").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection farmaco_ATC() {
        return farmaco_ATC(null);
    }

    public Terapia_altroResponseProjection farmaco_ATC(String alias) {
        add$(new GraphQLResponseField("farmaco_ATC").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection motivazione_fine() {
        return motivazione_fine(null);
    }

    public Terapia_altroResponseProjection motivazione_fine(String alias) {
        add$(new GraphQLResponseField("motivazione_fine").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection nome_farmaco() {
        return nome_farmaco(null);
    }

    public Terapia_altroResponseProjection nome_farmaco(String alias) {
        add$(new GraphQLResponseField("nome_farmaco").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection nome_gruppo() {
        return nome_gruppo(null);
    }

    public Terapia_altroResponseProjection nome_gruppo(String alias) {
        add$(new GraphQLResponseField("nome_gruppo").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection nome_tipo() {
        return nome_tipo(null);
    }

    public Terapia_altroResponseProjection nome_tipo(String alias) {
        add$(new GraphQLResponseField("nome_tipo").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection object_title() {
        return object_title(null);
    }

    public Terapia_altroResponseProjection object_title(String alias) {
        add$(new GraphQLResponseField("object_title").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection ricerca_farmaco() {
        return ricerca_farmaco(null);
    }

    public Terapia_altroResponseProjection ricerca_farmaco(String alias) {
        add$(new GraphQLResponseField("ricerca_farmaco").alias(alias));
        return this;
    }

    public Terapia_altroResponseProjection dosaggio____associables(DosaggioPageResponseProjection subProjection) {
        return dosaggio____associables((String)null, subProjection);
    }

    public Terapia_altroResponseProjection dosaggio____associables(String alias, DosaggioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dosaggio____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection dosaggio____associables(Terapia_altroDosaggio____associablesParametrizedInput input, DosaggioPageResponseProjection subProjection) {
        return dosaggio____associables(null, input, subProjection);
    }

    public Terapia_altroResponseProjection dosaggio____associables(String alias, Terapia_altroDosaggio____associablesParametrizedInput input, DosaggioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dosaggio____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection dosaggio_(DosaggioResponseProjection subProjection) {
        return dosaggio_(null, subProjection);
    }

    public Terapia_altroResponseProjection dosaggio_(String alias, DosaggioResponseProjection subProjection) {
        add$(new GraphQLResponseField("dosaggio_").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection farmaco___associables(Farmaco_altroPageResponseProjection subProjection) {
        return farmaco___associables((String)null, subProjection);
    }

    public Terapia_altroResponseProjection farmaco___associables(String alias, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection farmaco___associables(Terapia_altroFarmaco___associablesParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        return farmaco___associables(null, input, subProjection);
    }

    public Terapia_altroResponseProjection farmaco___associables(String alias, Terapia_altroFarmaco___associablesParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection farmaco(Farmaco_altroResponseProjection subProjection) {
        return farmaco(null, subProjection);
    }

    public Terapia_altroResponseProjection farmaco(String alias, Farmaco_altroResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection farmaco_ATC____associables(Farmaco_ATCPageResponseProjection subProjection) {
        return farmaco_ATC____associables((String)null, subProjection);
    }

    public Terapia_altroResponseProjection farmaco_ATC____associables(String alias, Farmaco_ATCPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_ATC____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection farmaco_ATC____associables(Terapia_altroFarmaco_ATC____associablesParametrizedInput input, Farmaco_ATCPageResponseProjection subProjection) {
        return farmaco_ATC____associables(null, input, subProjection);
    }

    public Terapia_altroResponseProjection farmaco_ATC____associables(String alias, Terapia_altroFarmaco_ATC____associablesParametrizedInput input, Farmaco_ATCPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_ATC____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection farmaco_ATC_(Farmaco_ATCResponseProjection subProjection) {
        return farmaco_ATC_(null, subProjection);
    }

    public Terapia_altroResponseProjection farmaco_ATC_(String alias, Farmaco_ATCResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_ATC_").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection Paziente_terapia_altro(PazienteResponseProjection subProjection) {
        return Paziente_terapia_altro(null, subProjection);
    }

    public Terapia_altroResponseProjection Paziente_terapia_altro(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("Paziente_terapia_altro").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection paziente_epatica(PazienteResponseProjection subProjection) {
        return paziente_epatica(null, subProjection);
    }

    public Terapia_altroResponseProjection paziente_epatica(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_epatica").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_altroResponseProjection typename() {
        return typename(null);
    }

    public Terapia_altroResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Terapia_altroResponseProjection deepCopy$() {
        return new Terapia_altroResponseProjection(this);
    }


}
