#
# Copyright (c) 2021 Airbyte, Inc., all rights reserved.
#

from unittest.mock import MagicMock

from source_hubplanner.source import SourceHubplanner


def test_check_connection(mocker):
    source = SourceHubplanner()
    logger_mock, config_mock = MagicMock(), MagicMock()
    assert source.check_connection(logger_mock, config_mock) == (True, None)


def test_streams(mocker):
    source = SourceHubplanner()
    config_mock = MagicMock()
    streams = source.streams(config_mock)
    expected_streams_number = 7
    assert len(streams) == expected_streams_number
