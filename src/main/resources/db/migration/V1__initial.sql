CREATE TABLE client
(
    id   bigint primary key,
    name text
);

CREATE TABLE car_model
(
    name  text,
    brand text,
    year  bigint,
    type  text,
    PRIMARY KEY (name, brand, year)
);


CREATE TABLE car
(
    chassis_no      text primary key,
    car_model_name  text,
    car_model_brand text,
    car_model_year  bigint,
    color           text,
    CONSTRAINT car_car_model_fk FOREIGN KEY (car_model_name, car_model_brand, car_model_year) REFERENCES car_model (name, brand, year)
);


CREATE TABLE car_rental
(
    id             bigint primary key,
    car_chassis_no text   not null,
    client_id      bigint not null,
    start_date     date,
    end_date       date,
    CONSTRAINT car_rental_car_fk FOREIGN KEY (car_chassis_no) REFERENCES car (chassis_no),
    CONSTRAINT car_rental_client_fk FOREIGN KEY (client_id) REFERENCES client (id)
);

INSERT INTO car_model(name, brand, year, type)
VALUES ('Lancer', 'Mitsu', '2010', 'sedan'),
       ('septar', 'bemveu', '2002', 'bolid'),
       ('A8', 'audi', '2021', 'bolid');

INSERT INTO car(chassis_no, car_model_name, car_model_brand, car_model_year, color)
VALUES ('simplu', 'septar', 'bemveu', '2002', 'negru'),
       ('complex', 'A8', 'audi', '2021', 'alb');
