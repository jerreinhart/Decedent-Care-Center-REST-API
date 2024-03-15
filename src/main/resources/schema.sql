DROP TABLE IF EXISTS decedent_service;
DROP TABLE IF EXISTS decedent_preparation;
DROP TABLE IF EXISTS service;
DROP TABLE IF EXISTS preparation;
DROP TABLE IF EXISTS decedent;

CREATE TABLE decedent (
	decedent_id int AUTO_INCREMENT NOT NULL,
	decedent_first_name varchar (250) NOT NULL,
	decedent_last_name varchar (250) NOT NULL,
	date_of_death NOT NULL,
	prep_required NOT NULL,
	service_info NOT NULL
	PRIMARY KEY (decedent_id)
);

CREATE TABLE preparation (
	decedent_id int NOT NULL,
	prep_type NOT NULL,
	date_of_prep NOT NULL,
	embalmer NOT NULL,
	merchanside NOT NULL,
	PRIMARY KEY (prep_type),
	FOREIGN KEY (decedent_id) REFERENCES decedent (decedent_id) ON DELETE CASCADE
);

CREATE TABLE service (
	decedent_id int NOT NULL,
	date_of_service NOT NULL,
	chapel NOT NULL,
	funeral_director NOT NULL,
	PRIMARY KEY (service_info),
	FOREIGN KEY (decedent_id) REFERENCES decedent (decedent_id) ON DELETE CASCADE
);

CREATE TABLE decedent_preparation (
	decedent_id int NOT NULL,
	prep_type NOT NULL,
	FOREIGN KEY (decedent_id) REFERENCES decedent (decedent_id) ON DELETE CASCADE,
	FOREIGN KEY (prep_type) REFERENCES preparation (prep_type) ON DELETE CASCADE,
	UNIQUE KEY (decedent_id, prep_type)
);

CREATE TABLE decedent_service (
	decedent_id int NOT NULL,
	service_info NOT NULL,
	FOREIGN KEY (decedent_id REFERENCES decedent (decedent_id) ON DELETE CASCADE,
	FOREIGN KEY (service_info) REFERENCES service (service_info) ON DELETE CASCADE,
	UNIQUE KEY (decedent_id, service_info)
);