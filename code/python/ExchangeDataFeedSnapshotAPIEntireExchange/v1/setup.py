"""
    Exchange Snapshot API

    A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange. Clients that need access to the DFSnapshot product for a custom watchlist snapped at a client specified interval should use this API  # noqa: E501

    The version of the OpenAPI document: 1.0
    Contact: teammustang@factset.com
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301
import os

def read(filename):
  return open(os.path.join(os.path.dirname(__file__), filename)).read()

NAME = "fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange"
VERSION = "0.21.3"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
  "urllib3 >= 1.25.3",
  "python-dateutil",
  "fds.sdk.utils >= 1.0.0",
]

setup(
    name=NAME,
    version=VERSION,
    description="Exchange DataFeed Snapshot API - Entire Exchange client library for Python",
    author="FactSet Research Systems",
    url="https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ExchangeDataFeedSnapshotAPIEntireExchange/v1",
    keywords=["FactSet", "API", "SDK"],
    python_requires=">=3.7",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="Apache License, Version 2.0",
    long_description_content_type="text/markdown",
    long_description=read("README.md")
)
