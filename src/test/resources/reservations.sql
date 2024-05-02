INSERT INTO theme (name, description, thumbnail)
VALUES ('테마1', '테마1 설명', 'https://via.placeholder.com/150/92c952'),
       ('테마2', '테마2 설명', 'https://via.placeholder.com/150/771796'),
       ('테마3', '테마3 설명', 'https://via.placeholder.com/150/24f355'),
       ('테마4', '테마4 설명', 'https://via.placeholder.com/150/30f9e7'),
       ('테마5', '테마5 설명', 'https://via.placeholder.com/150/56a8c2');

INSERT INTO reservation_time (start_at)
VALUES ('09:00'),
       ('12:00'),
       ('15:00'),
       ('18:00'),
       ('21:00');

INSERT INTO reservation (name, date, time_id, theme_id)
VALUES ('이름1', '2024-04-1', 1, 5),
       ('이름2', '2024-04-1', 2, 5),
       ('이름3', '2024-04-1', 3, 5),
       ('이름4', '2024-04-2', 1, 5),
       ('이름5', '2024-04-3', 2, 5),
       ('이름6', '2024-04-3', 3, 4),
       ('이름7', '2024-04-4', 4, 4),
       ('이름8', '2024-04-4', 1, 4),
       ('이름9', '2024-04-4', 2, 4),
       ('이름10', '2024-04-5', 1, 3),
       ('이름11', '2024-04-5', 2, 3),
       ('이름12', '2024-04-5', 3, 3),
       ('이름13', '2024-04-6', 1, 2),
       ('이름14', '2024-04-6', 2, 2),
       ('이름15', '2024-04-6', 3, 1);
