# Configuração 

## Baixe a imagem do Kafka do Docker, obs já contém o Zookeeper 

<code>
docker pull lensesio/fast-data-dev
</code>	

## Rode o Docker 

<code>
docker run --rm -p 2181:2181 -p 3030:3030 -p 8081-8083:8081-8083 -p 9581-9585:9581-9585 -p 9092:9092 -e ADV_HOST=localhost        lensesio/fast-data-dev:latest
</code>	

## Rodando a aplicação no Postman

<http://localhost:9000/kafka/publish>

- Method 
  - Post
- Raw 	
- Type
 - Json
<code>
{	
  "id": 1,
   "name": "Fabio Pedrosa",
   "age": 39
}
</code>
