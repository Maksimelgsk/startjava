DROP DATABASE IF EXISTS jaegers;

CREATE DATABASE jaegers;

\c jaegers

CREATE TABLE jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      CHAR(6),
    height    REAL,
    weight    REAL,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);