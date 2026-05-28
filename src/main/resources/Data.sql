INSERT INTO tb_sintoma (descricao) VALUES
                                       ('Febre'),
                                       ('Vômito'),
                                       ('Diarreia'),
                                       ('Perda de apetite'),
                                       ('Letargia'),
                                       ('Tosse'),
                                       ('Espirros'),
                                       ('Coceira'),
                                       ('Perda de pelo'),
                                       ('Dificuldade respiratória')
    ON CONFLICT DO NOTHING;

INSERT INTO tb_medicamento (nome) VALUES
                                      ('Amoxicilina'),
                                      ('Dipirona'),
                                      ('Ivermectina'),
                                      ('Omeprazol'),
                                      ('Prednisolona'),
                                      ('Metronidazol'),
                                      ('Doxiciclina'),
                                      ('Meloxicam'),
                                      ('Fluconazol'),
                                      ('Vitamina B12')
    ON CONFLICT DO NOTHING;