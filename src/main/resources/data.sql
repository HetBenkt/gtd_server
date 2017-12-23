--MEMEBERS
INSERT INTO MEMBERS (FIRST_NAME, LAST_NAME, EMAIL, NICKNAME, PASSWORD) VALUES ('John' , 'Doe'  , 'john.doe@gmail.com'   , 'John2018', 'admin');
INSERT INTO MEMBERS (FIRST_NAME, LAST_NAME, EMAIL, NICKNAME, PASSWORD) VALUES ('Bryan', 'Libby', 'bryan.libby@gmail.com', 'LibbyB'  , 'admin');

--BOARDS
INSERT INTO BOARDS (NAME, MEMBER_ID) VALUES ('Weekly planning', 1);
INSERT INTO BOARDS (NAME, MEMBER_ID) VALUES ('D2 Authority'   , 1);

--COLUMNS
INSERT INTO COLUMNS (NAME, BOARD_ID) VALUES ('Daily'      , 1);
INSERT INTO COLUMNS (NAME, BOARD_ID) VALUES ('Weekly'     , 1);
INSERT INTO COLUMNS (NAME, BOARD_ID) VALUES ('Monthly'    , 1);
INSERT INTO COLUMNS (NAME, BOARD_ID) VALUES ('ToDo'       , 2);
INSERT INTO COLUMNS (NAME, BOARD_ID) VALUES ('In progress', 2);
INSERT INTO COLUMNS (NAME, BOARD_ID) VALUES ('Done'       , 2);

--CARDS
INSERT INTO CARDS (NAME, COLUMN_ID) VALUES ('30 dagen fit'    , 1);
INSERT INTO CARDS (NAME, COLUMN_ID) VALUES ('Leer blind typen', 1);
INSERT INTO CARDS (NAME, COLUMN_ID) VALUES ('Trompet spelen'  , 1);

