INSERT INTO meteorologia (tdewf_avg, create_at, rh, rain_in_tot, bp_in_hg_avg, air_tempf_avg, panel_tempf_avg) VALUES(12.0,'2019-08-02 12:00:00', 25.1, 12.8, 85.5, -52.4, 12.0);
INSERT INTO meteorologia (tdewf_avg, create_at, rh, rain_in_tot, bp_in_hg_avg, air_tempf_avg, panel_tempf_avg) VALUES(12.0,'2019-08-14 17:00:00', 25.1, 12.8, 85.5, -52.4, 12.0);

INSERT INTO usuarios (username, password, enabled) VALUES ('Robert','$2a$10$8iqFXmhoOnTtFXBRqEKvQ.Yt5UZj.q4zoH3xp0W4Vov7FIYu8sbR6', 1);
INSERT INTO usuarios (username, password, enabled) VALUES ('admin','$2a$10$nUuu.HP8zE/hKN/NMDEbzeEIcDZ.TT9Wsf5sWD/y76cilVUhcfq2m', 1);

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (2,1);
