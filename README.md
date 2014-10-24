ods-lodms-core
==========

Management suite for automatic conversion, enrichment, caching and publishing of rdf data. 

## requirements
 * a virtuoso RDF store
 * Java 6+
 * maven 3 (maven 2 untested)

## build package

```
git submodule update --init
mvn -DskipTest clean package
```
