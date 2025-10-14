CREATE TABLE cars (
                      id BIGSERIAL PRIMARY KEY,                   -- Уникальный идентификатор
                      brand VARCHAR(50) NOT NULL,              -- Марка (например, Toyota)
                      model VARCHAR(50) NOT NULL,              -- Модель (например, Camry)
                      year_of_manufacture INTEGER NOT NULL,    -- Год выпуска
                      vin VARCHAR(17) UNIQUE,                  -- VIN-код (уникальный)
                      license_plate VARCHAR(15),               -- Государственный номер
                      engine_volume DECIMAL(3,1),              -- Объем двигателя (в литрах)
                      fuel_type VARCHAR(20),                   -- Тип топлива (бензин, дизель, электро)
                      horsepower INTEGER,                      -- Лошадиные силы
                      transmission_type VARCHAR(20),           -- Тип КПП (автомат, механика)
                      mileage INTEGER,                         -- Пробег (в км)
                      price DECIMAL(12,2),                     -- Цена
                      is_used BOOLEAN DEFAULT TRUE,            -- Состояние (новый/б/у)
                      created_at TIMESTAMP DEFAULT NOW(),      -- Дата добавления записи
                      updated_at TIMESTAMP DEFAULT NOW()       -- Дата последнего обновления
);

CREATE INDEX idx_cars_brand_model ON cars(brand, model);
CREATE INDEX idx_cars_year ON cars(year_of_manufacture);
CREATE INDEX idx_cars_price ON cars(price);