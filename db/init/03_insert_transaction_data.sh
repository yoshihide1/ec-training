#!/bin/bash

# CSVファイルのディレクトリを指定
echo "-------------------transaction data import-----------------------"
CSV_DIR="/test_data/transaction/"
echo "dir: $CSV_DIR"

# ディレクトリ内のすべてのCSVファイルを再帰的にループ処理
find "$CSV_DIR" -name "*.csv" | while read -r csv_file; do
    echo "csv file: $csv_file"
    
    # テーブル名をCSVファイル名から取得（.csvを削除）
    table_name=$(basename "$csv_file" .csv)

    # カラム名をCSVファイルの最初の行から取得
    columns=$(head -n 1 "$csv_file")

    # COPY文を作成
    echo "Executing COPY command for table: $table_name"
    psql -U "$POSTGRES_USER" -d "$POSTGRES_DB" -c "COPY $table_name ($columns) FROM '$csv_file' DELIMITER ',' CSV HEADER;"
done