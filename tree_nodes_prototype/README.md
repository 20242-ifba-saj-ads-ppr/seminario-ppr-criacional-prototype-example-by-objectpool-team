# Prototype - Documentação

## Introdução

Uma estrutura de arvore é uma estrutura hierarquica composta por nodes e folhas, onde um node pode ter como filhos outros nodes e folhas, e folhas nao podem ter filhos.

## Cenário

Imagine uma estrutura de arvore de pastas e arquivos, podendo conter centenas ou milhares de entidades, como realizar uma copia dessa estrutura.

## Solução Proposta

Podemos declarar uma interface que declare um metodo de clonagem, de forma que as pastas e arquivos saibam copiar a si mesmos, e as pastas podem simplesmente chamar o metodo de clonagem de seus filhos.

## De Para Participantes

**Prototype** -> **PrototypeInterface**

**ConcretePrototype** -> **FileNode e FolderNode**

**Cliente** -> **Main**