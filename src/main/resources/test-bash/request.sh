#!/bin/bash

number_request=$1
fallback_message="El servicio se encuentra en mantenimiento"

for ((i = 0; i < number_request; i++)); do
    echo -n $(( i + 1 )):
    echo -n " "
    output=$(
        curl -s --location --request GET 'http://localhost:8080/pokemon/pikachu' \
            --header 'Content-Type: application/json' \
            --data '{
    "jsonFileUrl": "src/main/resources/test/test.json" }'
    )
    if [[ "${fallback_message}" != "${output}" ]]; then
        echo "OK"
    else
        echo "Fallback message: $fallback_message"
    fi
done
