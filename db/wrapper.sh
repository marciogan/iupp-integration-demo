#!/bin/bash

echo "--------------------------------------------------";
echo "[IUPP-CATALOG] Executing Scylla loading script...";
echo "--------------------------------------------------";

echo "-----------------------------------------------------------------------";
echo "[IUPP-CATALOG] Removendo cqlshrc anterior em /root/.cassandra/cqlshrc ";
echo "-----------------------------------------------------------------------";
rm -rf /root/.cassandra/cqlshrc

# Script de criação do keyspace no loading do conteiner.
for f in docker-entrypoint-initdb.d/*; do
    case "$f" in
        *.cql)    echo "[IUPP-CATALOG] $0: running $f" && echo "" &&
            until cqlsh -f "$f"; do
                >&2 echo "" && echo "[IUPP-CATALOG] Scylla Service not available yet: waiting..." && echo "";
                sleep 10;
            done &
        ;;
    esac
    echo
done

exec /docker-entrypoint.py "$@"